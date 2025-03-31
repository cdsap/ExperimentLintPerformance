package com.performance.module_0_118

class Feature118UseCase0(
    private val repository: Feature118Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
