package com.performance.module_0_87

class Feature87UseCase2(
    private val repository: Feature87Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
