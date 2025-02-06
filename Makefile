CXX = g++
CXXFLAGS = -Wall -std=c++11
TARGET = a.out
SRC_DIR = ./cpp

all: $(TARGET)

$(TARGET): $(SRC_DIR)/main.cpp
	$(CXX) $(CXXFLAGS) -o $(TARGET) $(SRC_DIR)/main.cpp

clean:
	rm -f $(TARGET)