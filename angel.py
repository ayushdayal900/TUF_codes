from SmartApi.smartConnect import SmartConnect
import pyotp

# ==== 🔐 REPLACE THESE WITH YOUR CREDENTIALS ====
api_key = "UixYutdx "
client_id = "abc"
password = "Angel@123.aiml"
totp_secret = "467ad091-bf20-481b-8b18-3ef39febd30e "   # From Google Authenticator or SmartAPI dashboard

# ==== 🔐 Generate TOTP ====
totp = pyotp.TOTP(totp_secret).now()

# ==== 🔌 Initialize Connection ====
obj = SmartConnect(api_key=api_key)

data = obj.generateSession(client_id, password, totp)
refreshToken = data['data']['refreshToken']

# ==== 🔁 Get Profile ====
user_profile = obj.getProfile(refreshToken)
print("✅ Logged in as:", user_profile['data']['name'])

# ==== 🟩 Example: Fetch LTP for a newly listed IPO ====
# NSE Script Example: “TATACONSUM” or the symbol after listing

params = {
    "exchange": "NSE",
    "tradingsymbol": "TATACONSUM",  # Replace with IPO symbol
    "symboltoken": "2885"           # Get this from searchSymbol API
}

ltp_data = obj.ltpData(**params)
print("📈 LTP:", ltp_data['data']['ltp'])
