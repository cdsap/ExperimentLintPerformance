package com.performance.module_2_213

class Feature213UseCase2(
    private val repository: Feature213Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
