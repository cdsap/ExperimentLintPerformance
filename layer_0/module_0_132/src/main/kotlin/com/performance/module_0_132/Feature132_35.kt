package com.performance.module_0_132

class Feature132UseCase1(
    private val repository: Feature132Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
