import requests

headers = {
    "x-api-key": "5515406663f557c8f6fd493f56b5a2101c5a3e77b1919d79f04b89b69e542d4d"
}

statuses = ['open', 'closed', 'upcoming']

for status in statuses:
    print(f"\n🔹 Fetching IPOs with status: {status}")
    url = f"https://api.ipoalerts.in/ipos?status={status}"
    response = requests.get(url, headers=headers)

    if response.status_code != 200:
        print("❌ Error:", response.status_code, response.text)
        continue

    data = response.json()
    ipos = data.get("ipos", [])

    if not ipos:
        print("No IPOs found.")
        continue

    for ipo in ipos:
        print("=" * 50)
        print(f"Name        : {ipo.get('name')}")
        print(f"Slug        : {ipo.get('slug')}")
        print(f"Status      : {status}")
        print(f"Start Date  : {ipo.get('startDate')}")
        print(f"End Date    : {ipo.get('endDate')}")
        print(f"Price Range : {ipo.get('priceRange')}")
