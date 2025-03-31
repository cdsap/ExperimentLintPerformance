package com.performance.module_1_98

class Feature98UseCase0(
    private val repository: Feature98Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
