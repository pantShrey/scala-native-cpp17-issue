#include <iostream>
#include <vector>

void useStructuredBinding() {
    std::vector<std::pair<int, double>> data = {{1, 1.1}, {2, 2.2}};
    for (auto& [i, d] : data) {  // C++17 structured binding
        std::cout << "i=" << i << ", d=" << d << "\n";
    }
}

extern "C" void callUseStructuredBinding() {
    useStructuredBinding();
}
