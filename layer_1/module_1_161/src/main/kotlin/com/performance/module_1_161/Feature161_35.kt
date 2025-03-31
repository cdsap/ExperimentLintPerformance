package com.performance.module_1_161

class Feature161UseCase1(
    private val repository: Feature161Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
