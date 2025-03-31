package com.performance.module_3_68

class Feature68UseCase0(
    private val repository: Feature68Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
