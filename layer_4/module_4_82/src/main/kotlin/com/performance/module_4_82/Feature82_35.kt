package com.performance.module_4_82

class Feature82UseCase1(
    private val repository: Feature82Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
