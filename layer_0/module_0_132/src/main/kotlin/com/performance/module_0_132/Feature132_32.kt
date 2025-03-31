package com.performance.module_0_132

class Feature132UseCase0(
    private val repository: Feature132Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
