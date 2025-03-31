package com.performance.module_2_213

class Feature213UseCase0(
    private val repository: Feature213Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
