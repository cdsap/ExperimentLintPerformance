package com.performance.module_1_98

class Feature98UseCase2(
    private val repository: Feature98Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
