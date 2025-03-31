package com.performance.module_1_132

class Feature132UseCase2(
    private val repository: Feature132Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
