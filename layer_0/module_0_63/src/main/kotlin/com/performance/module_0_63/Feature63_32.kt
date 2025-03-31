package com.performance.module_0_63

class Feature63UseCase0(
    private val repository: Feature63Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
