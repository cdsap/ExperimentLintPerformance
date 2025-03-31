package com.performance.module_0_50

class Feature50UseCase0(
    private val repository: Feature50Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
