package main

import (
	"fmt"
	"net/http"
)

func serve() {
	http.HandleFunc("/", func(w http.ResponseWriter, r *http.Request) {
		w.Write([]byte("Hello, world!"))
	})
	http.HandleFunc("/register", func(w http.ResponseWriter, r *http.Request) {
		user := r.URL.Query()["user"][0]
		password := r.URL.Query()["password"][0]
		register(user, password)
		w.Write([]byte("User registered!"))
	})
	http.ListenAndServe(":8080", nil)
}

func register(user string, password string) {
	fmt.Printf("Registering new user %s with password %s.\n", user, password)
}

func main() {
	serve()
}
