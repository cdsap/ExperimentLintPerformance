package com.performance.module_4_87

class Feature87UseCase0(
    private val repository: Feature87Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
