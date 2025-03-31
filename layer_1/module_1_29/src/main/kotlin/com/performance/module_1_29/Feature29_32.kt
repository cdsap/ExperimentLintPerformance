package com.performance.module_1_29

class Feature29UseCase0(
    private val repository: Feature29Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
