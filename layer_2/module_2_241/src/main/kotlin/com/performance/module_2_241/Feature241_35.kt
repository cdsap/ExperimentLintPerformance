package com.performance.module_2_241

class Feature241UseCase1(
    private val repository: Feature241Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
