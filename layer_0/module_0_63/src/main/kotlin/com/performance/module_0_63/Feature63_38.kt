package com.performance.module_0_63

class Feature63UseCase2(
    private val repository: Feature63Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
