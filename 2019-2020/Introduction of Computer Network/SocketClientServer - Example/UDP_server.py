import socket
import sys

def server_program():
    port = 3296 

    server_socket = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)  
    server_socket.bind(('', port)) 
  
    while True:
        print ("Waiting to receive message.")
        data,client_address= server_socket.recvfrom(2048)
        message=data.decode()
        print ("Receive: " +message)
        if message:
            server_socket.sendto(message.encode(),client_address)

if __name__ == '__main__':
    server_program()
