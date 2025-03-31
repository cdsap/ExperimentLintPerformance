package com.performance.module_0_63

class Feature63UseCase1(
    private val repository: Feature63Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
