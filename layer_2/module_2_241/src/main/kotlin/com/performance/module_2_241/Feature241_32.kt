package com.performance.module_2_241

class Feature241UseCase0(
    private val repository: Feature241Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
