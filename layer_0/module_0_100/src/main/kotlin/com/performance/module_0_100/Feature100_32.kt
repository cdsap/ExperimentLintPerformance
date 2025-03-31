package com.performance.module_0_100

class Feature100UseCase0(
    private val repository: Feature100Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
