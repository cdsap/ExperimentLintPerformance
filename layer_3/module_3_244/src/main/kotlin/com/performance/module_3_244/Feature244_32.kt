package com.performance.module_3_244

class Feature244UseCase0(
    private val repository: Feature244Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
