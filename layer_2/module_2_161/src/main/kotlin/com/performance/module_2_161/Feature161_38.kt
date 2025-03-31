package com.performance.module_2_161

class Feature161UseCase2(
    private val repository: Feature161Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
