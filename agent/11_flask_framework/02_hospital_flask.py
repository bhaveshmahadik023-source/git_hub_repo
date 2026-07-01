
from flask import Flask , request , jsonify

app=Flask(__name__)

hospital =[
    {
    "id":1,
    "name":"MGM",
    "loc":"panvel",
    "class":"gov"
    },
    {
    "id":2,
    "name":"TATA",
    "loc":"Mumbai",
    "class":"Trust/NGO"
    },
    {
    "id":3,
    "name":"CIVIL",
    "loc":"Satara",
    "class":"Hybrid"
    },
    {
    "id":4,
    "name":"PULSE",
    "loc":"Murud",
    "class":"Private"
    },
    
]

@app.route("/get_info",methods=["GET"])
def get_hospital_info ():
    return hospital

@app.route("/post_info",methods=["POST"])
def insert_hospital_info():
    data = request.json
    hospital.append(data)
    return "insert succesfully"
    

if __name__ == "__main__":
    app.run()