package com.performance.module_2_155

class Feature155UseCase1(
    private val repository: Feature155Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
