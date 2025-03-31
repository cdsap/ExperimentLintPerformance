package com.performance.module_1_98

class Feature98UseCase1(
    private val repository: Feature98Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
