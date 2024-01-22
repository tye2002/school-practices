import socket


def server_program():
    host = socket.gethostname()
    port = 3296 

    server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)  
    server_socket.bind((host, port)) 
	
    server_socket.listen(2)
	
    connect_socket, address = server_socket.accept()  
    print("Connection from: " + str(address))
    while True:
        data = connect_socket.recv(1024).decode()
        if not data:
            break
        print("Client: " + str(data))
        data = input("Server: ")
        connect_socket.send(data.encode()) 
    connect_socket.close() 


if __name__ == '__main__':
    server_program()
