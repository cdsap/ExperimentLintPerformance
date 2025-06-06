package com.performance.module_0_100

class Feature100UseCase2(
    private val repository: Feature100Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
