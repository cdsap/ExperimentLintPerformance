package com.performance.module_3_270

class Feature270UseCase1(
    private val repository: Feature270Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
