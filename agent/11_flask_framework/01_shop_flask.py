from flask import Flask, request, jsonify

app = Flask(__name__)

shop = [
    {
        "id": 1,
        "company": "iphone",
        "model": 2026,
    },
    {
        "id": 2,
        "company": "samsung",
        "model": 2025,
    },
    {
        "id": 3,
        "company": "vivo",
        "model": 2024,
    }
]

@app.route("/getphone", methods=["GET"])
def get_phone():
    return jsonify(shop)


@app.route("/addphone",methods=["POST"])
def Post_phone():
    data =request.json
    shop.append(data)
    return "added succesfully"
   


if __name__ == "__main__":
    app.run()