package com.performance.module_1_132

class Feature132UseCase0(
    private val repository: Feature132Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
