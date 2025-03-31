package com.performance.module_3_270

class Feature270UseCase2(
    private val repository: Feature270Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
