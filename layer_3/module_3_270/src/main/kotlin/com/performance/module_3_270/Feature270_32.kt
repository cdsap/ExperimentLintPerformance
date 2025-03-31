package com.performance.module_3_270

class Feature270UseCase0(
    private val repository: Feature270Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
