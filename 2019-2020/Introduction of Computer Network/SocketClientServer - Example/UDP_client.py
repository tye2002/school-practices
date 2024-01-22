import socket


def client_program():
    host = socket.gethostname()  
    port = 3296 

    client_socket = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
    
    message = input("Enter an message: ")

    try:
        print ("Send:" + message)
        client_socket.sendto(message.encode(),(host,port))
        data=client_socket.recv(2048).decode()
        print ("Received: "+ data)
        client_socket.close()
    except EOFError:
        print ("An error occured.")
        
if __name__ == '__main__':
    client_program()
