package com.performance.module_4_82

class Feature82UseCase0(
    private val repository: Feature82Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
