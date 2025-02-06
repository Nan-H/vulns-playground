from flask import Flask, request, make_response, jsonify
import traceback

app = Flask(__name__)

def do_computation():
    raise Exception("Secret info")

# Stack-trace exposure
@app.route('/bad')
def server_bad():
    do_computation()
