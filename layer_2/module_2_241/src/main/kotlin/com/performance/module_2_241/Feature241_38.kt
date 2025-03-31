package com.performance.module_2_241

class Feature241UseCase2(
    private val repository: Feature241Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
