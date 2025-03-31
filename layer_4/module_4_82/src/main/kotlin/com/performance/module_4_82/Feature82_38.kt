package com.performance.module_4_82

class Feature82UseCase2(
    private val repository: Feature82Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
