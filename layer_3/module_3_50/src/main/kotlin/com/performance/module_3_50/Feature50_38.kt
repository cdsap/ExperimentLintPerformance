package com.performance.module_3_50

class Feature50UseCase2(
    private val repository: Feature50Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
