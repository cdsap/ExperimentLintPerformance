package com.performance.module_1_161

class Feature161UseCase0(
    private val repository: Feature161Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
