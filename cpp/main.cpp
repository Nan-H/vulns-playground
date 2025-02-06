#include <iostream>
#include <string>

void printGreeting(const std::string& message) {
    std::cout << "Hello, " << message << "!" << std::endl;
}

int main(int argc, char* argv[]) {
    std::string userName = (argc > 1) ? argv[1] : "world";
    printGreeting(userName);
    return 0;
}
