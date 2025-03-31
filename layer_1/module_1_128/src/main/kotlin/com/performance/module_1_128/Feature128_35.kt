package com.performance.module_1_128

class Feature128UseCase1(
    private val repository: Feature128Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
