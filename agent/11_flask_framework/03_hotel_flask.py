from flask import Flask,request,jsonify
   
app=Flask(__name__)

hotel_detail=[
    {
        "name":"two-five",
        "loc":"sarve",
        "categary":"5star",
        "num_employee":"1200"
    },
    {
        "name":"pratruti",
        "loc":"chikani",
        "categary":"4star",
        "num_employee":"1000"
    },
    {
        "name":"kashid beutique resort",
        "loc":"kashid",
        "categary":"3star",
        "num_employee":"800"
    },
    {
        "name":"aakash",
        "loc":"barshiv",
        "categary":"2star",
        "num_employee":"200"
    },
]

@app.route("/get_info_about_hotels", methods=["GET"])

def hotel_info():
    return hotel_detail

@app.route("/add_hotels",methods=["POST"])
def add_new_hotel():
    data=request.json
    hotel_detail.append(data)
    return "succesfully added"

if __name__ == "__main__":
    app.run()