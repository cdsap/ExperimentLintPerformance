package com.performance.module_0_50

class Feature50UseCase2(
    private val repository: Feature50Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
