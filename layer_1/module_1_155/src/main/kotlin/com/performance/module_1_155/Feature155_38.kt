package com.performance.module_1_155

class Feature155UseCase2(
    private val repository: Feature155Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
