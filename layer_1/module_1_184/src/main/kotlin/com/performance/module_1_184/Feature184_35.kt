package com.performance.module_1_184

class Feature184UseCase1(
    private val repository: Feature184Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
