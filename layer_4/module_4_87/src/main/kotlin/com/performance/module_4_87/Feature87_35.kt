package com.performance.module_4_87

class Feature87UseCase1(
    private val repository: Feature87Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
