import socket


def client_program():
    host = socket.gethostname()  
    port = 3296 

    client_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    client_socket.connect((host, port))

    message = input("Client: ")

    while message.lower().strip() != "bye":
        client_socket.send(message.encode())  
        data = client_socket.recv(1024).decode()  

        print('Server: ' + data) 

        message = input("Client: ") 

    client_socket.close()  


if __name__ == '__main__':
    client_program()
