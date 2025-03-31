package com.performance.module_2_155

class Feature155UseCase0(
    private val repository: Feature155Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
